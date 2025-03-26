# Anna Slenduhhova
No sabía como cargar una imagen en el archivo Readme.md, he usado el video del canal de Youtube de Dan Shahin (enlace al video: https://www.youtube.com/watch?v=nvPOUdz5PL4).
![Sketches](https://github.com/user-attachments/assets/a8b658c9-29c1-4759-be78-c602e94ac5a2)


## User Experience

1. Look and Feel: He añadido el skin GraphiteLookAndFeel de JTattoo. Razón: Los elementos como los botones son de color naranja, que coincide con el color del ícono principal de mi aplicación. También cambié el color del jListShowUsers en la vista MainAfterLogin para que el color seleccionado de un usuario coincida con este mismo color naranja.

2. Iconos: He añadido dos iconos. El primero, sobre el botón jButtonCalendario en la vista CreateWorkouts, es un ícono de calendario. El segundo, en el jMenu de la vista MainAfterLogin, es un ícono de "hamburger menu" con 3-4 líneas horizontales. Las fuentes de los dos iconos están registradas en la sección "Resources" del HelpDialog.

3. Fuentes: He cambiado la fuente de varios componentes, como, por ejemplo, jLabelHyperlink. En general, he usado la fuente Arial, en estilos plain o bold, con tamaños de 12 a 16 puntos.

4. Distribución y agrupación de componentes: He reorganizado algunos componentes en varias vistas. Por ejemplo, moví el botón jButtonCreateExercise de la vista ManageExercises a la vista MainAfterLogin. Además, en la vista MainAfterLogin, añadí varios JLabels para ofrecer más instrucciones al usuario. En lugar de un JList, utilicé un jComboBoxShowWorkouts, y reemplazando el JTextArea para los detalles de un entrenamiento, utilicé varios JLabels separados. También he reorganizado los elementos en la vista ManageExercises.

5. Layouts: He utilizado MigLayout en la vista CreateExercise para que los elementos se ajusten correctamente cuando el usuario cambia el tamaño de la ventana. Lamentablemente, no pude cambiar los layouts en toda la aplicación, a pesar de haber invertido bastante tiempo intentando hacerlo, pero no tuve éxito.

6. Gestión de errores y excepciones: He añadido un jLabelHelp en la vista Login para que, si el usuario olvida su contraseña o tiene otro problema, pueda encontrar un correo electrónico de contacto. También añadí un DocumentListener al jTextFieldEmail para validar si el correo electrónico es correcto mediante una expresión regular. Además, implementé un MouseListener en el jMenu de la vista Main para que el menú cambie de color cuando el ratón pasa por encima.

7. Otros cambios:

- He agregado un JProgressBar en la vista Login para que el usuario pueda ver el progreso si la aplicación tarda demasiado en acceder a la base de datos y verificar si el correo electrónico y la contraseña del usuario son correctos.
- He añadido un HashSet de AWTKeyStroke para que el usuario pueda saltar al siguiente JTextField presionando la tecla Enter o Tab. Sin embargo, no pude hacer que los botones de los formularios se presionen automáticamente cuando se pulsa Enter en el último JTextField.
- He añadido una vista DarkPattern. Utilicé un JDialog modal para que, cuando el usuario haga clic en el botón Login, se muestre un Dark Pattern. Para esta vista, establecí el LookAndFeel del sistema, para poder usar el método setUndecorated(true) y quitar la barra de título junto con el botón de cerrar. Añadí un botón de salida en la parte inferior izquierda del JDialog, para que sea más difícil de encontrar.
- He agregado un JMenuBar en la vista MainAfterLogin, con el ícono de un "hamburger menu". Esto permite añadir más JMenus y JMenuItems.
- He modificado mi CalendarComponent de la tarea anterior y he creado un nuevo componente llamado MyCalendar, que he usado en la vista CreateWorkouts. Cuando se hace clic en el botón jButtonCalendario, se abre mi calendario, donde se puede elegir la fecha de un entrenamiento.
- He añadido dos ToolTips en la vista CreateWorkouts: el primero para el calendario y el segundo para el jListExercises, explicando que para seleccionar múltiples ejercicios, el usuario debe presionar la tecla Ctrl.

# Javadoc generation
Intenté de muchas maneras modificar la configuración del plugin Maven para Javadoc, agregando <outputDirectory>${project.basedir}/doc</outputDirectory>, pero no funcionaba. Finalmente, encontré una solución copiando directamente la carpeta apidocs desde /target/reports a /docs.

Hice un commit con esta solución, pero después de seguir probando, descubrí que era posible generar el Javadoc automáticamente al hacer "Build" del proyecto. Para lograrlo, no solo agregué "<outputDirectory>${project.basedir}/doc</outputDirectory>", sino también la siguiente configuración en el pom.xml en el Maven Plugin: <execution><id>generate-javadoc</id><phase>package</phase><goals><goal>javadoc</goal></goals></execution>. 
Con este código, el Javadoc se genera directamente en la carpeta /doc cuando se ejecuta "Build".
