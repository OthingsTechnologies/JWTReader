package mx.com.othings.jwtreader2.JWT;

import android.util.Base64;

import com.google.gson.Gson;


public class JWT {

    private String jwt;
    private Header header;
    private PayLoad payload;
    private Gson gson;

    public JWT(String jwt){

        this.gson = new Gson();
        this.jwt = jwt;
        this.header = gson.fromJson(decode(jwt.split("\\.")[0]),Header.class);
        this.payload = gson.fromJson(decode(jwt.split("\\.")[1]),PayLoad.class);

    }

    private String decode(String token){

        byte[] decodedBytes = Base64.decode(token, Base64.DEFAULT);
        return new String(decodedBytes);

    }
    public Header getHeader(){
        return header;
    }
    public PayLoad getPayload(){
        return payload;
    }
    public String getToken(){
        return this.jwt;
    }

}
