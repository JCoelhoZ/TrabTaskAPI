package taskapi;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Main {
	public static void main(String args[]){
		Retrofit retrofit = new Retrofit.Builder()
			    .baseUrl("http://ec2-35-166-113-35.us-west-2.compute.amazonaws.com/")
			    .addConverterFactory(GsonConverterFactory.create())
			    .build();

		TaskApi api = retrofit.create(TaskApi.class);

		try {
			Call<Task> call = api.getTask();

			Response<Task> r = call.execute();

			Task t = r.body();

			System.out.println(t);

		}catch(Exception e) {
			e.printStackTrace();
		}




	}
}
