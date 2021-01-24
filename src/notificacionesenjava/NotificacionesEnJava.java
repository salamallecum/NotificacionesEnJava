package notificacionesenjava;

import ds.desktop.notify.DesktopNotify;
import ds.desktop.notify.NotifyTheme;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author lamaya
 */
public class NotificacionesEnJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Notificación sencilla (se borra al dar un click)
        /*
        DesktopNotify.showDesktopMessage(
                "Se trata de una notificación",
                "Con esta libreria, la visualización de notificaciones en pantalla es rápida y sencilla",
                DesktopNotify.SUCCESS);
        */  

        //Notificación temporizada (se cierra en un tiempo determinado - tiempo en ms)
        /*
        DesktopNotify.showDesktopMessage("¿No pasa nada con los clicks?", "Nótese que esta notificación no se puede cerrar con el ratón, esto se debe a que no todas las notificaciones se cierran con un clic. Se puede optar por darles un timepo de expiración en milisegundos, de modo que las notificaciones permanezcan un tiempo determinado en la pantalla.", DesktopNotify.TIP, 5000L); //dura 5 segundos
        */
        
        //Mensaje de informacion, desaparece al hacer click
        /*
        DesktopNotify.showDesktopMessage("Mensaje de Información", "Este es un mensaje de información, para propósito general. Se brinda un icono por defecto para este tipo de mensajes, pero se puede usar el que usted prefiera en su lugar", DesktopNotify.INFORMATION);
        */
        
        //Mensaje de advertencia, desaparece al hacer click        
        /*
        DesktopNotify.showDesktopMessage("Mensaje de Advertencia", "Este es un mensaje de información, Se brinda un icono por defecto para este tipo de mensajes, pero se puede usar el que usted prefiera en su lugar", DesktopNotify.WARNING);
        */
        
        //Mensaje de error, desaparece al hacer click        
        /*
        DesktopNotify.showDesktopMessage("Mensaje de Error", "Este es un mensaje de error, Se brinda un icono por defecto para este tipo de mensajes, pero se puede usar el que usted prefiera en su lugar", DesktopNotify.ERROR);
        */
        
        //Mensaje de exito, desaparece al hacer click        
        /*
        DesktopNotify.showDesktopMessage("Mensaje de Exito", "Este es un mensaje de exito, util para informar que un proceso o tarea se cumplió satisfactoriamente Se brinda un icono por defecto para este tipo de mensajes, pero se puede usar el que usted prefiera en su lugar", DesktopNotify.SUCCESS);
        */
        
        //Mensaje de Fallo, desaparece al hacer click        
        /*
        DesktopNotify.showDesktopMessage("Mensaje de fallo", "Este es un mensaje de fallo, util para informar que un proceso o tarea se ha concluido con un resultado desalentador, Se brinda un icono por defecto para este tipo de mensajes, pero se puede usar el que usted prefiera en su lugar", DesktopNotify.FAIL);
        */
        
        //Mensaje de ayuda, desaparece al hacer click        
        /*
        DesktopNotify.showDesktopMessage("Mensaje de Ayuda", "Este es un mensaje de ayuda, Se brinda un icono por defecto para este tipo de mensajes, pero se puede usar el que usted prefiera en su lugar", DesktopNotify.HELP);
        */
        
        //Mensaje de tip, desaparece al hacer click        
        /*
        DesktopNotify.showDesktopMessage("Mensaje de tip", "Este es un mensaje de Tip, Se brinda un icono por defecto para este tipo de mensajes, pero se puede usar el que usted prefiera en su lugar", DesktopNotify.TIP);
        */

        //Mensaje de pedido de entrada (ejecuta un evento al hacer click sobre ella)
        DesktopNotify.showDesktopMessage("Mensaje de Pedido de Entrada", "Este es un mensaje de pedido de entrada, úselo para solicitar datos (redirigiendo a un formulario de ingreso), Se brinda un icono por defecto para este tipo de mensajes, pero se puede usar el que usted prefiera en su lugar", DesktopNotify.INPUT_REQUEST, new ActionListener(){ @Override
            public void actionPerformed(ActionEvent e) {
                //Podemos utilizar un formulario frame o cualquier otro 
                //new Formulario().setVisible(true);
                
                //Tambien podemos mostrar mensajes simples, sin iconos
                DesktopNotify.setDefaultTheme(NotifyTheme.Light);
                DesktopNotify.showDesktopMessage("", "También puede mostrar mensajes sin un titulo, sin un icono, con un icono personalizado", DesktopNotify.HELP);
                
                
            }
        });
       
        
        
        
    }
    
}
