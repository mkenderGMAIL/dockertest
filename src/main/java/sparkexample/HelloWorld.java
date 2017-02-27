package sparkexample;

import static spark.Spark.get;

public class HelloWorld {
	public static void main(String[] args) throws Exception {
		get("/", (req, res) -> {
            return "hello from sparkjava.com";
        });
	}
}
