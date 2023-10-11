package com.jsdias.minhasfinancas.api.resource;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jsdias.minhasfinancas.api.DTO.UsuarioDTO;
import com.jsdias.minhasfinancas.model.entity.Usuario;
import com.jsdias.minhasfinancas.service.UsuarioService;

@ExtendWith( SpringExtension.class )
@ActiveProfiles( "teste" )
@WebMvcTest( controllers = UsuarioResource.class )
@AutoConfigureMockMvc
public class UsuarioResourceTest {
	
	static final String API = "/api/usuarios";
	static final MediaType JSON = MediaType.APPLICATION_JSON;
	
	@Autowired
	MockMvc mvc;
	
	@MockBean
	UsuarioService usuarioService;
	
	Usuario usuario;
	UsuarioDTO dto;
	
	private Long id = 1l;
	private String email = "usuario@email.com";
	private String senha = "123";
	
	@BeforeEach
	public void setUp() {
		usuario = Usuario.builder()
					.id(id)
					.email(email)
					.senha(senha)
					.build();
		
		dto = UsuarioDTO.builder()
				.email(email)
				.senha(senha)
				.build();
	}
	
	@Test
	public void deveAutenticarUmUsuario() throws Exception {
		
		Mockito.when(usuarioService.autenticar(email, senha)).thenReturn(usuario);
		
		String json = new ObjectMapper().writeValueAsString(dto);
		
		MockHttpServletRequestBuilder request = MockMvcRequestBuilders
													.post( API.concat("/autenticar") )
													.accept( JSON )
													.contentType( JSON )
													.content(json);
		mvc
			.perform(request)
			.andExpect(MockMvcResultMatchers.status().isOk())
			.andExpect(MockMvcResultMatchers.jsonPath("id").value(usuario.getId()))
			.andExpect(MockMvcResultMatchers.jsonPath("nome").value(usuario.getNome()))
			.andExpect(MockMvcResultMatchers.jsonPath("email").value(usuario.getEmail()));
	}
	
	
	
	
	
	
	
	
}
