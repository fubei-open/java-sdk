package com.fshows.fubei;

import com.fshows.fubei.foundation.utils.CodecUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.File;
import java.io.IOException;

@RunWith(JUnit4.class)
public class Base64UnitTest {
    @Test
    public void testBase64ToFile() throws IOException {
        String str = "iVBORw0KGgoAAAANSUhEUgAAABQAAAAVCAYAAABG1c6oAAACZklEQVQ4jbWUy2sTURTGv5vYR/pIjFqpin1IVaybgNKF6EJBcK+C6EJcigtXiktB/4eqGxFc6EYQBJ8o3XQhKq1aKWLRWqKpNLWxaTKZJFO/M2fIZGKim3jgMjN3zvmd571mlYImSqiZsP8NZOaf7gMPzwAT1/jp6PZKCnh+Hrh7EBi/AhQyfwWu8XkETN4AFt4DuXlg+CTQ0glM3QJmHgClvMLjQ8CuEzQw/wCKlItcNpBPA8Uc428BfkzyPa8ZWBl1KDohz9SEAvAqIDcj6/S1uMKICGyNegZVkk1qxBKt9RMYPAL07qlAgxG2x/VpZ5nqbcBhxEszGp3WBfjyhOuZvzf7FDj2iKRIDdDQQ9taL/UC63ldjWrHVL6N4+8vJzXSLgUG8+naROWwb1hv5GP9wPajQHSrp0d4YanyO1jDHVTMsjZli4YDQCcdvLvJxkx4KVKn/zAwcgEYuwT8mlOgVRcoEW4B9l9mDdkUx9bmTN/Rens8tzSSRUePZ0SgnWkAFG/fXnKwR70uLnKl/XrJI7+o3xK9MeqlZDUAyuy95XB/fYFAAY3x6zr/hk4WgL5DTHmWo9UNbN7XAJj7DqReK6yNMxjfqQYyn+lprimNfG4M2H0aOHAVbl9N3cFeVVhxWRWGTwGJcwR3a80+3mMjLmp6nx8DPQkg3KqmHRvpdH0NUNJJvWKHS4TE2PHjFSVXevey89sY5QeNMDnuRzZCR4mz7mtwDiMb9PAPcDRig4FfiPbppSCTINnIeS4VdDllv9yBG1tGxWbK4Xa9aWrFKWnn3a5WNU2OrJz7P4BNkKbf2L8B7MLqzEyIi/IAAAAASUVORK5CYII=";
        CodecUtil.base64ToFile(str, new File("1.png"));
    }
}
