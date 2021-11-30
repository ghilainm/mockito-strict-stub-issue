package com.poppy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class LibraryServiceTest {

    @Mock
    LibraryRepository libraryRepository;
    @InjectMocks
    LibraryService libraryService;

    @Test
    void storeBookFailingTest() {
        // given
        libraryService.storeBook();

        // verify
        Mockito.verifyNoInteractions(libraryRepository);
    }

    @Test
    void storeBookNotFailingTest() {
        // given
        libraryService.storeBook();

        // verify
        // Expect automatic verification as strict stubbing is enabled
    }

}
