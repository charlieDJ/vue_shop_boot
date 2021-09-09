package com.vivi.vue.shop;

import org.apache.commons.io.FileUtils;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * @author dj
 * @date 2021/9/8
 */
public class ConvertTest {

    @Test
    public void h2() {
        try {
            convert("D:\\temp\\vue_shop.sql");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String convert(String filePath) throws IOException {
        String[] rawSQL = new String(Files.readAllBytes(Paths.get(filePath))).split("\\n");
        List<String> ddlList = new ArrayList<>();
        List<String> dmlList = new ArrayList<>();

        for (String line : rawSQL) {
            if (line.contains("CHARACTER SET utf8 COLLATE utf8_general_ci")) {
                line = line.replaceAll("CHARACTER SET utf8 COLLATE utf8_general_ci", "");
            } else if (line.contains("INDEX")) {
                continue;
            } else if (line.contains("IF NOT EXISTS")) {
                line = line.replaceAll("IF NOT EXISTS", "");
            } else if (line.contains("--")) {
                continue;
            } else if (line.contains("ENGINE")) {
                line = line.replaceAll("\\).*ENGINE.*(?=)", ");");
            } else if (line.contains("USING BTREE")) {
                line = line.replaceAll("USING BTREE*", "");
            }

            line = line.replace("`", "");

            if (line.contains("INSERT INTO")) {
                dmlList.add(line);
            } else {
                ddlList.add(line);
            }
        }
        String dml = String.join("\n", dmlList);
        String ddl = String.join("\n", ddlList);
        FileUtils.writeStringToFile(new File("D:\\temp\\ddl.sql"), ddl, StandardCharsets.UTF_8);
        FileUtils.writeStringToFile(new File("D:\\temp\\dml.sql"), dml, StandardCharsets.UTF_8);
        return "";
    }
}
