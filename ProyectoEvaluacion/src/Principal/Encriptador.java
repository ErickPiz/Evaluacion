package Principal;

import java.awt.Component;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.swing.JTextField;

/**
 * @author Piz
 */
public class Encriptador {
    KeyGenerator generadorKey;
    SecretKey keyes;
    Cipher cifrador;
    byte[] texto;
    
    public Encriptador() {
        try {
            generadorKey = KeyGenerator.getInstance("DES");
            keyes = generadorKey.generateKey();
            cifrador = Cipher.getInstance("DES/ECB/PKCS5Padding");
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Encriptador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchPaddingException ex) {
            Logger.getLogger(Encriptador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void encriptar(JTextField txt){
        try {
            cifrador.init(Cipher.ENCRYPT_MODE,keyes);
            //byte[] aEncritar =txt.getText().getBytes();
            texto=cifrador.doFinal(txt.getText().getBytes());
            txt.setText( String.valueOf(cifrador.doFinal(txt.getText().getBytes())));
        } catch (InvalidKeyException ex) {
            Logger.getLogger(Encriptador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalBlockSizeException ex) {
            Logger.getLogger(Encriptador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BadPaddingException ex) {
            Logger.getLogger(Encriptador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void desencriptar(JTextField txt){
        try {
            cifrador.init(Cipher.DECRYPT_MODE,keyes);
            byte[] desencriptado = cifrador.doFinal(txt.getText().getBytes());
            txt.setText(new String(desencriptado));
        } catch (InvalidKeyException ex) {
            Logger.getLogger(Encriptador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalBlockSizeException ex) {
            Logger.getLogger(Encriptador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BadPaddingException ex) {
            Logger.getLogger(Encriptador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
