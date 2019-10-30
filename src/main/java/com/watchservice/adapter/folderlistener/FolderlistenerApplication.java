package com.watchservice.adapter.folderlistener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author adrianopalomino
 *
 */
@SpringBootApplication
public class FolderlistenerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FolderlistenerApplication.class, args);

		// executa o ouvinte de diretórios
		FolderListener.listen();
	}

}
