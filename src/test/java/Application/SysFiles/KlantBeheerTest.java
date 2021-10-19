package Application.SysFiles;

import Application.Webshop.Klant;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class KlantBeheerTest {

    @Mock
    private Klant k;
    @InjectMocks
    private KlantBeheer kB;

    @Test
    void registreerNieuweKlant() {
        when(kB.lijstVanKlanten.add(k)).thenReturn(true);


        assertTrue(kB.lijstVanKlanten.add(k) == true);
    }


}