package org.java.hueta;
import org.java.hueta.Main.*;

public class Inspector implements MailService{
    public void PackageChecker (MailPackage mailPackage) {
        System.out.println("Hello");
    }

    @Override
    public Sendable processMail(Sendable mail) {


        return mail;
    }
}
