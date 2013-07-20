package algorithms;

/**
 * @author Andrew Lichman vmdeep@yandex.ru
 * 
 * @task
 * В системе авторизации существует ограничение на формат логина: 
 * «Логин должен начинаться с латинской буквы, может состоять из латинских букв, цифр, точки и минуса и должен заканчиваться латинской буквой или цифрой. 
 * Минимальная длина логина — 1 символ. Максимальная — 20 символов».
 * Напишите на Java метод, проверяющий, соответствует ли входная строка этому правилу.
 */
public class LogIn {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(isLoginOk("a")); //true
		System.out.println(isLoginOk("a.5")); //true
		System.out.println(isLoginOk("a..................3")); //true
		System.out.println(isLoginOk("a........")); //false
		System.out.println(isLoginOk("a......................5")); //false
		System.out.println(isLoginOk("1.5")); //false

	}
	
	public static Boolean isLoginOk(String login){
		return login.matches("^[a-z,A-Z]++([a-z,A-Z,\\-,\\.]{0,18}[\\d,\\w]){0,1}$");

	}

}
