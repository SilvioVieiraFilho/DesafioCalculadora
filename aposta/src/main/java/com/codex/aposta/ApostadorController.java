package codex.aposta;




@Restcontroller
public class ApostadorController {


@PostMapping("/apostador")



public ResponseEntity salvapostador(@RequestBody ApostadorIn apostadorIn){

System.out.println("Calma respira relaxa novinha ");

return ResponseEntity.status(CREATED ).build();

} 
    
}
