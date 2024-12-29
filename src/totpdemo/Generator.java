/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package totpdemo;
import java.time.Instant;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

/**
 *
 * @author admin
 */
public class Generator {
     public static String generateTOTP( int timeStep) {
        try {
            // Đặt số giây hiện tại từ Unix epoch (1970-01-01)
            long currentTime = Instant.now().getEpochSecond() / timeStep;
            
           
            String secretKey = "JBSWY3DPEHPK3PXP";           
            byte[] key = Base64.getDecoder().decode(secretKey);
            
            // Cấu hình HMAC-SHA1
            Mac mac = Mac.getInstance("HmacSHA1");
            SecretKeySpec keySpec = new SecretKeySpec(key, "HmacSHA1");
            mac.init(keySpec);

            // Chuyển đổi thời gian hiện tại thành mảng byte
            byte[] timeBytes = new byte[8];
            for (int i = 7; i >= 0; i--) {
                timeBytes[i] = (byte) (currentTime & 0xff);
                currentTime >>= 8;
            }

            // Áp dụng HMAC và lấy phần cuối của kết quả
            byte[] hash = mac.doFinal(timeBytes);
            int offset = hash[hash.length - 1] & 0xf;
            int otp = (hash[offset] & 0x7f) << 24 | (hash[offset + 1] & 0xff) << 16 | (hash[offset + 2] & 0xff) << 8 | (hash[offset + 3] & 0xff);
            otp = otp % 1000000;

            // Trả về mã OTP dưới dạng chuỗi 6 chữ số
            return String.format("%06d", otp);
        } catch (Exception e) {
            throw new RuntimeException("Lỗi khi tạo mã OTP", e);
        }
    }
}
