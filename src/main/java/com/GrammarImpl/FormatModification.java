package com.GrammarImpl;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.RoundingMode;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FormatModification {
    private static Logger logger = LoggerFactory.getLogger (TextProcessor.class);
    private static final Map <String, String> DATE_FORMAT_REGEXPS = new HashMap <String, String> ( ) {{
        put ("^\\d{8}$", "yyyyMMdd");
        put ("^\\d{1,2}-\\d{1,2}-\\d{4}$", "dd-MM-yyyy");
        put ("^\\d{4}-\\d{1,2}-\\d{1,2}$", "yyyy-MM-dd");
        put ("^\\d{1,2}/\\d{1,2}/\\d{4}$", "MM/dd/yyyy");
        put ("^\\d{4}/\\d{1,2}/\\d{1,2}$", "yyyy/MM/dd");
        put ("^\\d{1,2}\\s[a-z]{3}\\s\\d{4}$", "dd MMM yyyy");
        put ("^\\d{1,2}\\s[a-z]{4,}\\s\\d{4}$", "dd MMMM yyyy");
        put ("^\\d{12}$", "yyyyMMddHHmm");
        put ("^\\d{8}\\s\\d{4}$", "yyyyMMdd HHmm");
        put ("^\\d{1,2}-\\d{1,2}-\\d{4}\\s\\d{1,2}:\\d{2}$", "dd-MM-yyyy HH:mm");
        put ("^\\d{4}-\\d{1,2}-\\d{1,2}\\s\\d{1,2}:\\d{2}$", "yyyy-MM-dd HH:mm");
        put ("^\\d{1,2}/\\d{1,2}/\\d{4}\\s\\d{1,2}:\\d{2}$", "MM/dd/yyyy HH:mm");
        put ("^\\d{4}/\\d{1,2}/\\d{1,2}\\s\\d{1,2}:\\d{2}$", "yyyy/MM/dd HH:mm");
        put ("^\\d{1,2}\\s[a-z]{3}\\s\\d{4}\\s\\d{1,2}:\\d{2}$", "dd MMM yyyy HH:mm");
        put ("^\\d{1,2}\\s[a-z]{4,}\\s\\d{4}\\s\\d{1,2}:\\d{2}$", "dd MMMM yyyy HH:mm");
        put ("^\\d{14}$", "yyyyMMddHHmmss");
        put ("^\\d{8}\\s\\d{6}$", "yyyyMMdd HHmmss");
        put ("^\\d{1,2}-\\d{1,2}-\\d{4}\\s\\d{1,2}:\\d{2}:\\d{2}$", "dd-MM-yyyy HH:mm:ss");
        put ("^\\d{4}-\\d{1,2}-\\d{1,2}\\s\\d{1,2}:\\d{2}:\\d{2}$", "yyyy-MM-dd HH:mm:ss");
        put ("^\\d{1,2}/\\d{1,2}/\\d{4}\\s\\d{1,2}:\\d{2}:\\d{2}$", "MM/dd/yyyy HH:mm:ss");
        put ("^\\d{4}/\\d{1,2}/\\d{1,2}\\s\\d{1,2}:\\d{2}:\\d{2}$", "yyyy/MM/dd HH:mm:ss");
        put ("^\\d{1,2}\\s[a-z]{3}\\s\\d{4}\\s\\d{1,2}:\\d{2}:\\d{2}$", "dd MMM yyyy HH:mm:ss");
        put ("^\\d{1,2}\\s[a-z]{4,}\\s\\d{4}\\s\\d{1,2}:\\d{2}:\\d{2}$", "dd MMMM yyyy HH:mm:ss");
    }};

    public static String determineDateFormat(String dateString) {
        for (String regexp : DATE_FORMAT_REGEXPS.keySet ( )) {
            if (dateString.toLowerCase ( ).matches (regexp)) {
                return DATE_FORMAT_REGEXPS.get (regexp);
            }
        }
        return null; // Unknown format.
    }

    public static String changeNumberFormat(String text, String initialFormat, String finalFormat) {
        logger.info ("CHANGE NUMBER FORMAT PROCESSING ...");
        String regex = findFormat (initialFormat);
        Pattern p = Pattern.compile (regex, Pattern.CASE_INSENSITIVE);
        Integer count = 0;
        Matcher m = p.matcher (text);
        Double val = null;
        DecimalFormat df = new DecimalFormat (finalFormat);
        df.setRoundingMode (RoundingMode.CEILING);
        while (m.find ( )) {
            count ++;
            try {
                if (StringUtils.isNumeric (m.group ( ))) {
                    throw new NumberFormatException ("NUMBER FORMAT EXCEPTION: FOR INPUT: " + m.group ( ));
                }
                val = Double.parseDouble (m.group ( ));
                text = text.replace (val.toString ( ), df.format (val));
                System.out.println ("MATCH: " + val);
            } catch (NumberFormatException e) {
                logger.error (e.getMessage ( ));
            }
        }
        if (count == 0) {
            logger.warn ("NO WORD FOUND");
            return null;
        } else {
            logger.info ("TOTAL NUMBER OF MATCHES: " + count);
        }
        return text;
    }

    public static String findFormat(String expresion) {
        ArrayList <String> charcterSequence = new ArrayList <> ( );
        char[] expr = expresion.toCharArray ( );
        Integer count = 0;
        Boolean symbolMatch = false;
        Boolean wordMatch = false;
        for (int i = 0; i < expr.length; i++) {
            if (expr[i] == '*') {
                wordMatch = true;
            }
            if (!(expr[i] == '#') && !(expr[i] == '*')) {
                if (count != 0) {
                    charcterSequence.add (count.toString ( ));
                }
                charcterSequence.add (String.valueOf (expr[i]));
                count = 0;
                symbolMatch = true;
            } else if (i == expr.length - 1) {
                count++;
                charcterSequence.add (count.toString ( ));

            } else {
                count++;
            }
        }

        String regex = TextProcessor.regexFormatIdentifier (charcterSequence, symbolMatch, wordMatch);
        return regex;
    }

    public static String changeDateFormat(String text, String initialFormat, String finalFormat) {
        logger.info ("CHANGE DATE FORMAT PROCESSING ...");
        finalFormat = finalFormat.replace ("|", " ");
        String regex = findFormat (initialFormat);
        Pattern p = Pattern.compile (regex, Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher (text);
        Integer count = 0;
        while (m.find ( )) {
            String initial = determineDateFormat (m.group ( ));
            DateFormat originalFormat = new SimpleDateFormat (initial, Locale.ENGLISH);
            DateFormat targetFormat = new SimpleDateFormat (finalFormat);
            System.out.println ("MATCH: " + m.group ( ));

            try {
                Date date = originalFormat.parse (m.group ( ));
                String formattedDate = targetFormat.format (date);
                text = text.replace (m.group ( ), formattedDate);
            } catch (ParseException e) {
                logger.warn ("IS NOT A DATE FORMAT : " + m.group ( ));
            }
        }
        if (count == 0) {
            logger.warn ("NO WORD FOUND");
            return null;
        } else {
            logger.info ("TOTAL NUMBER OF MATCHES: " + count);
        }
        return text;
    }
}
