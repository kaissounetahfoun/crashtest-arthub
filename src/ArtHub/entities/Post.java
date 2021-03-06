
package ArtHub.entities;

import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import java.io.Serializable;
import java.sql.Date;

/**
 *test
 * @author Adam
 */
public class Post extends RecursiveTreeObject<Post> implements Serializable {
    
    
    private int id_post;
    private String nom_post ;
    private String Description;
    private String categorie;
    private String post_date;
    private String file;
    private int Likes;
      private String album_cover;
    private User id_user;
     private String desc_analys;

    public Post(int id_post, String nom_post, String Description, String categorie, String post_date, String file, int Likes, String album_cover, String desc_analys) {
        this.id_post = id_post;
        this.nom_post = nom_post;
        this.Description = Description;
        this.categorie = categorie;
        this.post_date = post_date;
        this.file = file;
        this.Likes = Likes;
        this.album_cover = album_cover;
        this.desc_analys=desc_analys;
        
    }

    public Post() {
    }
    
    
    
    

    public Post(int id_post, String nom_post, String Description, String categorie, String post_date, String file, int Likes, String desc_analys,User id_user) {
        this.id_post = id_post;
        this.nom_post = nom_post;
        this.Description = Description;
        this.categorie = categorie;
        this.post_date = post_date;
        this.file = file;
        this.Likes = Likes;
        this.id_user = id_user;
        this.desc_analys = desc_analys;
        
    }
   
    public void setId_user(User id_user) {
        this.id_user = id_user;
    }
    

    public String getDesc_analys() {
        return desc_analys;
    }

    public void setDesc_analys(String desc_analys) {
        this.desc_analys = desc_analys;
    }

    public String getAlbum_cover() {
        return album_cover;
    }

    public void setAlbum_cover(String album_cover) {
        this.album_cover = album_cover;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public int getLikes() {
        return Likes;
    }

    public void setLikes(int Likes) {
        this.Likes = Likes;
    }

    
    public Post(int id_post, String nom_post, String Description, String categorie, String post_date) {
        this.id_post = id_post;
        this.nom_post = nom_post;
        this.Description = Description;
        this.categorie = categorie;
        this.post_date = post_date;
    }
    
    
    
   
    
    
    
    public Post(int id, String nom, String Description) {
        this.id_post = id;
        this.nom_post = nom;
        this.Description = Description;
        this.categorie = categorie;
        this.post_date = post_date;
    }

    public Post(int id_post, String nom_post, String Description, String categorie, String post_date, String file, int Likes, String desc_analys) {
        this.id_post = id_post;
        this.nom_post = nom_post;
        this.Description = Description;
        this.categorie = categorie;
        this.post_date = post_date;
        this.file = file;
        this.Likes = Likes;
        this.desc_analys=desc_analys;
    }

    public Post(int id_post, String nom_post, String Description, String categorie) {
        this.id_post = id_post;
        this.nom_post = nom_post;
        this.Description = Description;
        this.categorie = categorie;
        
    }

    public User getId_user() {
        return id_user;
    }
    
    
     public Post(int id_post) {
        this.id_post = id_post;
    }
    
    public Post(User id_user, String rNom_post, String rdesc,String desc_analys) {
        this.id_user= id_user;
        this.Description = rdesc;
        this.nom_post = rNom_post;
        this.desc_analys=desc_analys;
    }
    
    
    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }
    public int getId_post() {
        return id_post;
    }

    public void setId_post(int id_post) {
        this.id_post = id_post;
    }

    public String getNom_post() {
        return nom_post;
    }

    public void setNom_post(String nom_post) {
        this.nom_post = nom_post;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getPost_date() {
        return post_date;
    }

    public void setPost_date(String post_date) {
        this.post_date = post_date;
    }

   
    @Override
    public String toString() {
        return "Person{" + "id=" + id_post + ", nom=" + nom_post + ", prenom=" + Description + '}';
    }

    public User getid_user() {
        return id_user;
        
    }
    
    
   
    
    
}
