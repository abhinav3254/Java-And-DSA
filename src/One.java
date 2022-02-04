import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class One {
    public static void main(String[] args) throws IOException {
        System.out.println("Kolkata API");
        MyGETRequestKolkata();
        System.out.println("Bangalore API");
        MyGETRequestBangalore();
        System.out.println("Delhi API");
        MyGETRequestDelhi();
    }
    public static void MyGETRequestKolkata() throws IOException {
        URL urlForGetRequest = new URL("https://api.weatherapi.com/v1/current.json?key=4e46c4b681fa451f9ac70013220102&q=Kolkata&aqi=no");
        String readLine = null;
        HttpURLConnection conection = (HttpURLConnection) urlForGetRequest.openConnection();
        conection.setRequestMethod("GET");
        //conection.setRequestProperty("userId", "a1bcdef");
        // set userId it's a sample here
        int responseCode = conection.getResponseCode();


        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(conection.getInputStream()));
            StringBuffer response = new StringBuffer();
            while ((readLine = in .readLine()) != null) {
                response.append(readLine);
            } in .close();
            // print result
            System.out.println("JSON String Result " + response.toString());
            //GetAndPost.POSTRequest(response.toString());
        } else {
            System.out.println("GET NOT WORKED");
        }

    }
    public static void MyGETRequestBangalore() throws IOException {
        URL urlForGetRequest = new URL("https://api.weatherapi.com/v1/current.json?key=4e46c4b681fa451f9ac70013220102&q=Bangalore&aqi=no");
        String readLine = null;
        HttpURLConnection conection = (HttpURLConnection) urlForGetRequest.openConnection();
        conection.setRequestMethod("GET");
        //conection.setRequestProperty("userId", "a1bcdef");
        // set userId it's a sample here
        int responseCode = conection.getResponseCode();


        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(conection.getInputStream()));
            StringBuffer response = new StringBuffer();
            while ((readLine = in .readLine()) != null) {
                response.append(readLine);
            } in .close();
            // print result
            System.out.println("JSON String Result " + response.toString());
            //GetAndPost.POSTRequest(response.toString());
        } else {
            System.out.println("GET NOT WORKED");
        }

    }
    public static void MyGETRequestDelhi() throws IOException {
        URL urlForGetRequest = new URL("https://api.weatherapi.com/v1/current.json?key=4e46c4b681fa451f9ac70013220102&q=Delhi&aqi=no");
        String readLine = null;
        HttpURLConnection conection = (HttpURLConnection) urlForGetRequest.openConnection();
        conection.setRequestMethod("GET");
        //conection.setRequestProperty("userId", "a1bcdef");
        // set userId it's a sample here
        int responseCode = conection.getResponseCode();


        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(conection.getInputStream()));
            StringBuffer response = new StringBuffer();
            while ((readLine = in .readLine()) != null) {
                response.append(readLine);
            } in .close();
            // print result
            System.out.println("JSON String Result " + response.toString());
            //GetAndPost.POSTRequest(response.toString());
        } else {
            System.out.println("GET NOT WORKED");
        }

    }
}

/*
*
            String api_response = response.toString();
            Object obj=JSONValue.parse(api_response);
            JSONObject jsonObject = (JSONObject) obj;
            //System.out.println("JSON String Result " + response.toString());

            String name = (String) jsonObject.get("name");
            System.out.println(name);
* */
