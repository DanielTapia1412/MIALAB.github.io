/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facturacion;

import Facturacion.KeyStoreProvider;
import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.security.*;
import java.security.cert.CertificateException;

// Referenced classes of package firma:
//            KeyStoreProvider

public abstract class PKCS11KeyStoreProvider
    implements KeyStoreProvider
{

    public PKCS11KeyStoreProvider()
    {
    }

    public abstract String getConfig();

    public KeyStore getKeystore(char password[])
        throws KeyStoreException
    {
        try
        {
            InputStream configStream = new ByteArrayInputStream(getConfig().getBytes());
            Provider sunPKCS11Provider = createSunPKCS11Provider(configStream);
            Security.addProvider(sunPKCS11Provider);
            KeyStore keyStore = KeyStore.getInstance("PKCS11");
            keyStore.load(null, password);
            return keyStore;
        }
        catch(CertificateException e)
        {
            throw new KeyStoreException(e);
        }
        catch(NoSuchAlgorithmException e)
        {
            throw new KeyStoreException(e);
        }
        catch(IOException e)
        {
            throw new KeyStoreException(e);
        }
    }

    private Provider createSunPKCS11Provider(InputStream configStream)
        throws KeyStoreException
    {
        try
        {
            Class sunPkcs11Class = Class.forName("sun.security.pkcs11.SunPKCS11");
            Constructor pkcs11Constr = sunPkcs11Class.getConstructor(new Class[] {
                java.io.InputStream.class
            });
            return (Provider)pkcs11Constr.newInstance(new Object[] {
                configStream
            });
        }
        catch(ClassNotFoundException e)
        {
            throw new KeyStoreException(e);
        }
        catch(NoSuchMethodException e)
        {
            throw new KeyStoreException(e);
        }
        catch(InvocationTargetException e)
        {
            throw new KeyStoreException(e);
        }
        catch(IllegalAccessException e)
        {
            throw new KeyStoreException(e);
        }
        catch(InstantiationException e)
        {
            throw new KeyStoreException(e);
        }
    }
}

