package DemoGit.DemoGit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoGitApplication {

	public static void main(String[] args) {
		System.out.println("Main Branch Changed");
		SpringApplication.run(DemoGitApplication.class, args);
		System.out.println("2nd Commit");
		System.out.println("3nd Commit");


	}

}
