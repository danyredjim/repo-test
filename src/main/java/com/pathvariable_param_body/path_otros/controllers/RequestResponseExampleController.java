package com.pathvariable_param_body.path_otros.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pathvariable_param_body.path_otros.models.Thing;

@RestController
public class RequestResponseExampleController {
	
	// Método GET - Obtener un recurso
    @GetMapping("/getThing")
    public ResponseEntity<Void> getThing() {
        return ResponseEntity.noContent().build();
    }

    /*
     * Llamada desde Angular para obtener un recurso
     * 
     * import { HttpClient } from '@angular/common/http';
     * 
     * constructor(private http: HttpClient) {}
     * 
     * getThing() {
     *   this.http.get('http://localhost:8080/things/getThing')
     *     .subscribe(response => {
     *       console.log(response);
     *     });
     * }
     */

    
    
    
    
    
    // Método POST - Crear un recurso
    @PostMapping("/saveThing")
    public ResponseEntity<Void> saveThing(@RequestBody Thing thing) {
        return ResponseEntity.noContent().build();
    }

    /*
     * Llamada desde Angular para guardar un recurso
     * 
     * import { HttpClient } from '@angular/common/http';
     * 
     * constructor(private http: HttpClient) {}
     * 
     * saveThing(thing: any) {
     *   this.http.post('http://localhost:8080/things/saveThing', thing)
     *     .subscribe(response => {
     *       console.log(response);
     *     });
     * }
     */

    
    
    
    
    
    // Método PUT - Actualizar un recurso
    @PutMapping("/{cod}")
    public ResponseEntity<Void> updateThing(@PathVariable Long cod, @RequestBody Thing thing) {
        // Aquí puedes hacer la lógica de actualización
        return ResponseEntity.noContent().build();
    }

    /*
     * Llamada desde Angular para actualizar un recurso
     * 
     * import { HttpClient } from '@angular/common/http';
     * 
     * constructor(private http: HttpClient) {}
     * 
     * updateThing(cod: number, thing: any) {
     *   this.http.put(`http://localhost:8080/things/${cod}`, thing)
     *     .subscribe(response => {
     *       console.log(response);
     *     });
     * }
     */

    
    
    
    
    
    
    // Método DELETE - Eliminar un recurso
    @DeleteMapping("/{cod}")
    public ResponseEntity<Void> deleteThing(@PathVariable Long cod) {
        return ResponseEntity.noContent().build();
    }

    /*
     * Llamada desde Angular para eliminar un recurso
     * 
     * import { HttpClient } from '@angular/common/http';
     * 
     * constructor(private http: HttpClient) {}
     * 
     * deleteThing(cod: number) {
     *   this.http.delete(`http://localhost:8080/things/${cod}`)
     *     .subscribe(response => {
     *       console.log(response);
     *     });
     * }
     */
	
	
}
