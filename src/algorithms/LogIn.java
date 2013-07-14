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
		System.out.println(isLoginOk("h........b"));

	}
	
	public static Boolean isLoginOk(String login){
		return login.matches("^[a-z,A-Z]++([a-z,A-Z,\\-,\\.]{0,18}?[\\d,\\w])$");

	}

}
