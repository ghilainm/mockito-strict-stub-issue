package com.poppy;

class LibraryService {

    private final LibraryRepository libraryRepository;

    LibraryService(LibraryRepository libraryRepository) {
        this.libraryRepository = libraryRepository;
    }

    void storeBook() {
        libraryRepository.saveBook();
    }

}
