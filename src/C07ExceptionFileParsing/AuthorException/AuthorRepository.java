package C07ExceptionFileParsing.AuthorException;

//저장소 역할을 하는 계층

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AuthorRepository {

    private static List<Author> authorList = new ArrayList<>();

    public  void register(Author author){
                authorList.add(author);
    }

    public Optional<Author> findByEmail(String email){
        Optional<Author> authorWhoIsFoundByEmail =Optional.empty();

        for(Author a: authorList){
                    if(a.getEmail().equals(email)){
                        authorWhoIsFoundByEmail =Optional.ofNullable(a);
                    }
                } return authorWhoIsFoundByEmail;

    }

    public void findAll(){
            for(Author a: authorList){
                System.out.println(a);
            }
    }



}
