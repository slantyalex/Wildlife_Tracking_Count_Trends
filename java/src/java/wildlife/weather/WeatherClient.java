package wildlife.weather;

import com.open_meteo.sdk.WeatherApiResponse;
import com.openmeteo.sdk.VariablesAndTime;
import com.openmeteo.sdk.VariableAndValues;

import okhttp3.Request;
import okhttp3.Response;
import okhttp3.OkHttpClient;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class WeatherClient{
    public WeatherRecord weather_details() throws Exception{
        OkHttpClient client = new OkHttpClient();
        String url = "https://api.open-meteo.com/v1/forecast?latitude=40.58&longitude=-105.10&current_weather=true&format=flatbuffers";

        Request request = new Request.Builder().url(url).build();

        try(Response response = client.newCall(request).execute()){
            if(response.isSuccessful()){
                byte[] bytes = response.body().bytes();
                ByteBuffer buffer = ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN);
                WeatherApiResponse apiResponse = WeatherApiResponse.getRootAsWeatherApiResponse(buffer);
            }
        }
    }
}
