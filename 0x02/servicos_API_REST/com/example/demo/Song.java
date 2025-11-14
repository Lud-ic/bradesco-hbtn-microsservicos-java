package com.example.demo;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Song {
    private Integer id;
    private String nome;
    private String artista;
    private String album;
    private String anoLancamento;
}
