package no.hackaton.termos.example.commands;

import no.hackaton.termos.*;
import no.hackaton.termos.extra.*;

import java.io.*;

/**
 * @author <a href="mailto:trygvis@java.no">Trygve Laugst&oslash;l</a>
 * @version $Id$
 */
public class SillyCommand implements CliCommand {

    public final String id;

    public SillyCommand(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void run(InputStream stdin, OutputStream stdout, OutputStream stderr, ReadLineEnvironment environment, String[] args) throws IOException {
        PrintWriter writer = new PrintWriter(stdout);
        writer.println("Running " + id);
        writer.flush();
    }
}
