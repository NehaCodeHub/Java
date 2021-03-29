
public class DemoApiTest {

	String url= "https://api.mocki.io/v1/b043df5a";
			
			
	public static void main(String[] args) {
	public void method1() {
		
		Response res =
                given().
                        header("Content-Type", "application/json").
                        when().
                        get(url).
                        then().
                        extract().response();
		
		System.out.println(res);

		
		
	  }
	}			
					
}
