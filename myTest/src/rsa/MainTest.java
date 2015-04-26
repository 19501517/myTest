package rsa;
import java.security.Provider;
import java.security.Security;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.util.HashMap;

public class MainTest {
	public static void main(String[] args) throws Exception {
		
		System.out.println("/getPhoneParam.action".contains("/getPhoneParam.action"));
		
		HashMap<String, Object> map = RSAUtils.getKeys();
		RSAPublicKey publicKey = (RSAPublicKey) map.get("public");
		RSAPrivateKey privateKey = (RSAPrivateKey) map.get("private");

		// 模
		String modulus = publicKey.getModulus().toString(16);
		// 公钥指数
		String public_exponent = publicKey.getPublicExponent().toString(16);
		// 私钥指数
		String private_exponent = privateKey.getPrivateExponent().toString(16);
		// 明文
		String ming = "123";
		// 使用模和指数生成公钥和私钥
		RSAPublicKey pubKey = RSAUtils.getPublicKey(modulus, public_exponent);
		RSAPrivateKey priKey = RSAUtils
				.getPrivateKey(modulus, private_exponent);
		// 加密后的密文
		String mi = RSAUtils.encryptByPublicKey(ming, pubKey);
		System.err.println(mi);
		// 解密后的明文
		ming = RSAUtils.decryptByPrivateKey(mi, priKey);
		System.err.println(ming);
		
//		System.out.println(publicKey);
//		System.out.println(privateKey);
		
	}
}
