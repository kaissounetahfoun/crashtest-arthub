/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArtHub.gui;

import ArtHub.entities.Partenaire;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import com.jfoenix.controls.JFXButton;
import java.io.IOException;
//import java.time.Duration;
import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.util.Duration;
import ArtHub.entities.Post;
import static ArtHub.gui.FRONT_EventController.setImage;
import static ArtHub.gui.FRONT_EventController.userHomeFolder;
import static ArtHub.gui.LoginController.CurrentUser;
import ArtHub.services.PartenaireCRUD;
import ArtHub.services.postCRUD;
import java.util.List;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import com.jfoenix.controls.JFXTabPane;
import com.jfoenix.controls.JFXTextField;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


/**
 * FXML Controller class
 *
 * @author Adam Khalfaoui
 */







public class FeedGuiController implements Initializable {

    
    @FXML
    private JFXButton cp_btn;
     @FXML
    private AnchorPane anchorRoot;
      
     @FXML
    private StackPane parentContainer;
    @FXML
    private JFXButton btn_event;
    
    
    @FXML
    private ScrollPane scroll1;
    @FXML
    private HBox ph_postes;

  
  
    private MyListener myListener;
    @FXML
    private HBox music_postes;
    @FXML
    private Label lblfeedback;
    @FXML
    private ImageView BtnClose;
    @FXML
    private ImageView btnSearch;
      
    int tindex;
    @FXML
    private JFXTabPane pan2;
    @FXML
    private ScrollPane scroll11;
    @FXML
    private HBox ph_postes1;
    @FXML
    private HBox music_postes1;
    @FXML
    private JFXTextField input;
    @FXML
    private ScrollPane scrol2;
    @FXML
    private ScrollPane scroll222;
    @FXML
    private ScrollPane bigscroll1;
    @FXML
    private ScrollPane bigscroll2;
    @FXML
    private ImageView user_image;
    @FXML
    private ImageView logout;
    @FXML
    private Label usernameCurrent;
    @FXML
    private ScrollPane scrollPartner;
    @FXML
    private HBox PartnerHbox;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        List<Partenaire> myLest;
        PartenaireCRUD pt = new PartenaireCRUD();
        myLest = pt.consulterPartenaire();
          PartnerHbox.getChildren().clear();
       for (int i = 0; i < myLest.size(); i++) {

            try {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("ItemPartner.fxml"));
                AnchorPane EventBox = fxmlLoader.load();
                ItemPartnerController controller = fxmlLoader.getController();
                controller.setData(myLest.get(i));
                PartnerHbox.getChildren().add(EventBox);
            } catch (IOException ex) {
                Logger.getLogger(FRONT_EventController.class.getName()).log(Level.SEVERE, null, ex);
            }   }
          usernameCurrent.setText(CurrentUser.getUsername());
          setImage(CurrentUser.getImage(), user_image);
          scrollPartner.setHbarPolicy(ScrollBarPolicy.NEVER);
             scrollPartner.setVbarPolicy(ScrollBarPolicy.NEVER);
      pan2.getSelectionModel().select(1);
        tindex = pan2.getSelectionModel().getSelectedIndex();
         setImage("C:\\xampp\\php\\www\\ArtBox-CrashTest\\src\\ArtHub\\images\\icons8_Search_52px.png",btnSearch);
          setImage("C:\\xampp\\php\\www\\ArtBox-CrashTest\\src\\ArtHub\\images\\close.png",BtnClose);
       
         //****************************NEW****************    
       
        ph_postes.setSpacing(20);
        scroll1.setHbarPolicy(ScrollBarPolicy.NEVER);
        scroll1.setVbarPolicy(ScrollBarPolicy.NEVER);
        
         bigscroll1.setHbarPolicy(ScrollBarPolicy.NEVER);
         bigscroll1.setVbarPolicy(ScrollBarPolicy.NEVER);
         
         
        bigscroll2.setHbarPolicy(ScrollBarPolicy.NEVER);
        bigscroll2.setVbarPolicy(ScrollBarPolicy.NEVER);
         
         
         scroll222.setHbarPolicy(ScrollBarPolicy.NEVER);
         scroll222.setVbarPolicy(ScrollBarPolicy.NEVER);
         
         
          scrol2.setHbarPolicy(ScrollBarPolicy.NEVER);
         scrol2.setVbarPolicy(ScrollBarPolicy.NEVER);
         
         scroll11.setHbarPolicy(ScrollBarPolicy.NEVER);
         scroll11.setVbarPolicy(ScrollBarPolicy.NEVER);
       
        postCRUD ps = new postCRUD();
        List<Post> postes ;
        
       postes = ps.consulteImage();
      
        
        try {
            for (int i = 0; i < postes.size(); i++) {
                
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("PostG.fxml"));
                AnchorPane PostBox = fxmlLoader.load();
                PostGController postController = fxmlLoader.getController();
                postController.setData(postes.get(i));
                ph_postes.getChildren().add(PostBox);
                
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
      
        // TODO
        
        //Load poste de type music*************************
        
        
        ph_postes.setSpacing(20);
        
        music_postes.setSpacing(20);
       
        postCRUD ps1 = new postCRUD();
        List<Post> postes1  ;
        postes1 = ps1.consulteMusic();
        
        
        try {
            for (int j = 0; j < postes1.size(); j++) {
              
                FXMLLoader fxmlLoader1 = new FXMLLoader();
                fxmlLoader1.setLocation(getClass().getResource("mp3.fxml"));
                
                AnchorPane MusicBox = fxmlLoader1.load();
                System.out.println("heeeeeeeeeere");
                mp3Controller mp3Controller = fxmlLoader1.getController();
                mp3Controller.setData(postes1.get(j));
                music_postes.getChildren().add(MusicBox);
                
            }   
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
    //****************************NEW****************    
        
           
         ph_postes1.setSpacing(20);
        
        music_postes1.setSpacing(20);
        
         postCRUD ps2 = new postCRUD();
        List<Post> postes2 ;
        
       postes2 = ps2.consulteImagePouplar();
      
        
        try {
            for (int k = 0; k < postes2.size(); k++) {
                
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("PostG.fxml"));
                AnchorPane PostBox = fxmlLoader.load();
                PostGController postController = fxmlLoader.getController();
                postController.setData(postes2.get(k));
                ph_postes1.getChildren().add(PostBox);
                
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
      
        // TODO
        
        //Load poste de type music*************************
        
        
        ph_postes.setSpacing(20);
        
        music_postes.setSpacing(20);
       
        postCRUD ps3 = new postCRUD();
        List<Post> postes3  ;
        postes3 = ps3.consulteMusicPopular();
        
        
        try {
            for (int f = 0; f < postes3.size(); f++) {
              
                FXMLLoader fxmlLoader1 = new FXMLLoader();
                fxmlLoader1.setLocation(getClass().getResource("mp3.fxml"));
                
                AnchorPane MusicBox = fxmlLoader1.load();
                System.out.println("heeeeeeeeeere");
                mp3Controller mp3Controller = fxmlLoader1.getController();
                mp3Controller.setData(postes3.get(f));
                music_postes1.getChildren().add(MusicBox);
                
            }   
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
         //****************************Followed****************    
        
    
    
    
    
    
    
    
    }  
    
    
    
    @FXML
    private void load_ajoute(ActionEvent event ) throws IOException {
      Parent root = FXMLLoader.load(getClass().getResource("Ajout_post.fxml"));
      Scene scene = cp_btn.getScene();
      
      root.translateXProperty().set(scene.getHeight());
      parentContainer.getChildren().add(root);
      
           
      
      
      
      Timeline timeline = new Timeline();
      KeyValue kv = new KeyValue(root.translateXProperty(),0,Interpolator.EASE_IN);
      KeyFrame kf = new KeyFrame(Duration.seconds(0.4),kv);
      timeline.getKeyFrames().add(kf);
       
      timeline.play(); 
        //parentContainer.getChildren().remove(anchorRoot);
      
      
      
      
      
  
        
    }

    @FXML
    private void load_event(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("FRONT_Event.fxml"));
      Scene scene = btn_event.getScene();
      
      root.translateXProperty().set(scene.getHeight());
      parentContainer.getChildren().add(root);
      
           
      
      
      
      Timeline timeline = new Timeline();
      KeyValue kv = new KeyValue(root.translateXProperty(),0,Interpolator.EASE_IN);
      KeyFrame kf = new KeyFrame(Duration.seconds(0.4),kv);
      timeline.getKeyFrames().add(kf);
       
      timeline.play(); 
        //parentContainer.getChildren().remove(anchorRoot);
      
      
      
      
      
  
        
    }
    
    
    
    

    public void affiche(URL location, ResourceBundle resources) {
       
         
    }

    @FXML
    private void addFeedback(MouseEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AddFeedback.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setTitle("Statistiques");
            
            stage.setScene(new Scene(root1));
            
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(FRONT_EventController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void load_jobs(ActionEvent event) {
         try {
            Parent root = FXMLLoader.load(getClass().getResource("FRONT_annonce.fxml"));
            Scene scene = btn_event.getScene();
            
            root.translateXProperty().set(scene.getHeight());
            parentContainer.getChildren().add(root);
            
            Timeline timeline = new Timeline();
            KeyValue kv = new KeyValue(root.translateXProperty(), 0, Interpolator.EASE_IN);
            KeyFrame kf = new KeyFrame(Duration.seconds(0.4), kv);
            timeline.getKeyFrames().add(kf);
            
            timeline.play();
            //parentContainer.getChildren().remove(anchorRoot);
        } catch (IOException ex) {
            Logger.getLogger(FRONT_EventController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void close(MouseEvent event) {
          Stage CurrentStage = (Stage) BtnClose.getScene().getWindow();
        CurrentStage.close();
    }

     @FXML
    private void closeOFF(MouseEvent event) {
         setImage("C:\\xampp\\php\\www\\ArtBox-CrashTest\\src\\ArtHub\\images\\close.png",BtnClose);
    }

    @FXML
    private void closeON(MouseEvent event) {
         setImage("C:\\xampp\\php\\www\\ArtBox-CrashTest\\src\\ArtHub\\images\\closeON.png",BtnClose);
    }

    @FXML
    private void showUserProfile(MouseEvent event) {
          try {
            Parent root = FXMLLoader.load(getClass().getResource("UserProfile.fxml"));
            Scene scene = BtnClose.getScene();
            
            root.translateXProperty().set(scene.getHeight());
            parentContainer.getChildren().add(root);
            
            Timeline timeline = new Timeline();
            KeyValue kv = new KeyValue(root.translateXProperty(), 0, Interpolator.EASE_IN);
            KeyFrame kf = new KeyFrame(Duration.seconds(0.4), kv);
            timeline.getKeyFrames().add(kf);
            
            timeline.play();
            //parentContainer.getChildren().remove(anchorRoot);
        } catch (IOException ex) {
            Logger.getLogger(FRONT_EventController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void logout(MouseEvent event) {
           try {
           
           Stage stage1 = (Stage) BtnClose.getScene().getWindow();
           stage1.close();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Login.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setTitle("Host an event");
          
            stage.setScene(new Scene(root1));

            stage.show();
               
            
        } catch (IOException ex) {
            Logger.getLogger(FRONT_EventController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    

    

   
    
}

