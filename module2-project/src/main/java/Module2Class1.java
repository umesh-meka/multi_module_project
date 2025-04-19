import com.google.common.base.Optional;

public class Module2Class1 {

	public static void main(String[] args) {
		Optional<String> name = Optional.of("Rahul");
		System.out.println(name.isPresent());
	}

}
