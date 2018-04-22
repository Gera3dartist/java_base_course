package com.gera.javacore.exercises.Chapter5;

import java.io.IOException;
import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class Ex14 {
    public static class HTMLFormatter extends java.util.logging.Formatter {
        public String format(LogRecord record) {
            return ("<tr><td>" + (new Date(record.getMillis())).toString() + "</td><td>"
                    + record.getMessage() + "</td></tr>\n");
        }

        public String getHead(Handler h) {
            return ("<html>\n  <body>\n" + "<Table border>\n<tr><td>Time</td><td>Log Message</td></tr>\n");
        }

        public String getTail(Handler h) {
            return ("</table>\n</body>\n</html>");
        }
    }
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger("com.gera.javacore.exercises.Chapter5.Ex14_15_16");
        logger.setUseParentHandlers(false);
        Handler htmlHandler = new FileHandler("log.html");
        htmlHandler.setFormatter(new HTMLFormatter());
        logger.addHandler(htmlHandler);
        logger.info("Some message");
        logger.info("Some drugs");
        logger.info("Some sex");
        logger.info("Some C++");


    }
}
