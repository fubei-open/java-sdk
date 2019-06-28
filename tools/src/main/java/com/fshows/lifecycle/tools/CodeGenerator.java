package com.fshows.lifecycle.tools;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.base.Strings;
import com.google.common.io.CharStreams;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.util.List;

/**
 * 代码生成工具
 *
 * @author John (linwei@fshows.com)
 * @version $Id CodeGenerator.java, v1.0 2019-06-09 23:27 John Exp$
 */
@SuppressWarnings("FieldCanBeLocal")
public class CodeGenerator {
    private String file = "/data.txt";
    private String template = "/template.txt";

    @SuppressWarnings("UnstableApiUsage")
    private void loadResource() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream(file)));
        BufferedReader readerTemplate = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream(template)));
        try {
            List<String> lines = CharStreams.readLines(reader);
            String template = Joiner.on("\n").join(CharStreams.readLines(readerTemplate));
            StringBuilder sb = new StringBuilder();
            for (String line : lines) {
                parseLines(line, template, sb);
            }
            System.out.println(sb.toString());
            try (FileOutputStream fs = new FileOutputStream("out.txt")) {
                fs.write(sb.toString().getBytes(StandardCharsets.UTF_8));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void parseLines(String line, String template, StringBuilder sb) {
        List<String> list = Splitter.on("\t").splitToList(line);
        System.out.println(list);
        String jsonFieldName = list.get(0);
        String remark = list.get(4);
        String rawType = list.get(1);

        String ret = template.replace("${REMARK}", remark)
                .replace("${JSON_FIELD}", jsonFieldName.replace("\"", "\\\\\""))
                .replace("${DATA_TYPE}", getType(rawType))
                .replace("${FIELD_NAME}", getFieldName(jsonFieldName));
        sb.append("\n").append(ret).append("\n");
    }

    private String getFieldName(String jsonFieldName) {
        StringBuilder sb = new StringBuilder();
        boolean uppercaseFlag = false;
        for (char c : jsonFieldName.toCharArray()) {
            if (c == '_') {
                uppercaseFlag = true;
                continue;
            }
            if (uppercaseFlag) {
                sb.append(Character.toUpperCase(c));
                uppercaseFlag = false;
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    private String getType(String rawType) {
        if (Strings.isNullOrEmpty(rawType)) {
            return Object.class.getSimpleName();
        }
        String type;
        switch (rawType.toLowerCase()) {
            case "int":
            case "integer":
                type = Integer.class.getSimpleName();
                break;

            case "long":
                type = Long.class.getSimpleName();
                break;

            case "string":
                type = String.class.getSimpleName();
                break;

            case "float":
            case "decimal":
            case "bigdecimal":
                type = BigDecimal.class.getSimpleName();
                break;

            case "array":
                type = "List<>";
                break;

            default:
                type = Object.class.getSimpleName();
                break;
        }
        return type;
    }

    public static void main(String[] args) {
        new CodeGenerator().loadResource();
    }
}
