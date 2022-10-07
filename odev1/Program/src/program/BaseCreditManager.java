/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

/**
 *
 * @author merve
 */
public abstract class  BaseCreditManager implements ICreditManager{
    
    @Override
    public abstract void calculate() ;
    

    public  void save() {
        System.out.println("kayıt gerçekleşti.");
    }
    
}
