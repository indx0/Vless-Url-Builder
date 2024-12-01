package com.indexzero;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.indexzero.util.FileUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        System.out.println("VLESS URL Builder");
        System.out.println("Source Code: https://github.com/indx0/Vless-Url-Builder");


        String jsonString = "";

        try {
            jsonString = FileUtils.readFromFile(args[0]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("No File Path Specified");
            return;
        }
        catch (Exception e) {
            System.out.println("Something went wrong when reading the file.");
            return;
        }


        try {
            JsonObject jsonObject = JsonParser.parseString(jsonString)
                    .getAsJsonObject();
            JsonElement outbounds = jsonObject.getAsJsonArray("outbounds").get(0).getAsJsonObject().get("settings").getAsJsonObject().get("vnext").getAsJsonArray().get(0);
            JsonElement streamSettings = jsonObject.getAsJsonArray("outbounds").get(0).getAsJsonObject().get("streamSettings").getAsJsonObject();

            String addressAndPort = outbounds.getAsJsonObject().get("address").getAsString() + ":" + outbounds.getAsJsonObject().get("port").getAsString();
            String flow = outbounds.getAsJsonObject().get("users").getAsJsonArray().get(0).getAsJsonObject().get("flow").getAsString();
            String id = outbounds.getAsJsonObject().get("users").getAsJsonArray().get(0).getAsJsonObject().get("id").getAsString();
            String type = streamSettings.getAsJsonObject().get("network").getAsString();
            String security = streamSettings.getAsJsonObject().get("security").getAsString();
            String fp = streamSettings.getAsJsonObject().get("realitySettings").getAsJsonObject().get("fingerprint").getAsString();
            String pbk = streamSettings.getAsJsonObject().get("realitySettings").getAsJsonObject().get("publicKey").getAsString();
            String sni = streamSettings.getAsJsonObject().get("realitySettings").getAsJsonObject().get("serverName").getAsString();
            String sid = streamSettings.getAsJsonObject().get("realitySettings").getAsJsonObject().get("shortId").getAsString();

            String url = String.format("vless://%s@%s?flow=%s&type=%s&security=%s&fp=%s&sni=%s&pbk=%s&sid%s", id, addressAndPort, flow, type, security, fp, sni, pbk, sid);

            System.out.printf("\nYour URL is: %s%n", url);
        }
        catch (JsonParseException e) {
            System.out.println("File is not a valid JSON");
            return;
        }
    }
}