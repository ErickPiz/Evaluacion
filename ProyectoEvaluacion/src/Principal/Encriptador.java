package Principal;

import CustomComponents.LabelTextField;
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
    public void encriptar(LabelTextField txt){
        try {
            cifrador.init(Cipher.ENCRYPT_MODE,keyes);
            byte[] aEncritar =txt.getTextFieldText().getBytes();
            texto=cifrador.doFinal(aEncritar);
            txt.setTextFieldText(new String(cifrador.doFinal(txt.getTextFieldText().getBytes())));
        } catch (InvalidKeyException ex) {
            Logger.getLogger(Encriptador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalBlockSizeException ex) {
            Logger.getLogger(Encriptador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BadPaddingException ex) {
            Logger.getLogger(Encriptador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void desencriptar(LabelTextField txt){
        try {
            cifrador.init(Cipher.DECRYPT_MODE,keyes);
            byte[] desencriptado = cifrador.doFinal(texto);
            txt.setTextFieldText(new String(desencriptado));
        } catch (InvalidKeyException ex) {
            Logger.getLogger(Encriptador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalBlockSizeException ex) {
            Logger.getLogger(Encriptador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BadPaddingException ex) {
            Logger.getLogger(Encriptador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
