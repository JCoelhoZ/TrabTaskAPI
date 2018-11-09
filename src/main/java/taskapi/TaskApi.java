package taskapi;

import mavenproj.Time;
import retrofit2.Call;
import retrofit2.http.GET;

public interface TaskApi {
	@GET("https://gist.githubusercontent.com/leandersonandre/6f8aeaaa99baca45b9c2020b5f3c85e7/raw/091c5d46f514a25e68f174457bebc66c85eac11c/chelsea.json")
	Call<Time> getTime();
}
