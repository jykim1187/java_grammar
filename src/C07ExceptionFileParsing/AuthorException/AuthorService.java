package C07ExceptionFileParsing.AuthorException;

//핵심 로직을 구현하는 계층

import java.util.NoSuchElementException;
import java.util.Optional;

public class AuthorService {
    private AuthorRepository authorRepository;

    public AuthorService(){
       authorRepository = new AuthorRepository();
    }


    public  void register(String name, String email, String password) {
//        AuthorRepository에  findByEmail활용
        if (authorRepository.findByEmail(email).isPresent()) {
            throw new IllegalArgumentException("이미 가입되어있는 이메일입니다.");
        } else {
            if (password.length() < 8) {
                throw new NoSuchElementException("비밀번호가 8자리 이상이어야 합니다");
            } else {
                Author newAuthor = new Author(name, email, password);
                this.authorRepository.register(newAuthor);
            }
        }
    }

    public boolean login(String email, String password){
        Optional<Author> a1 = this.authorRepository.findByEmail(email);
        a1.orElseThrow(()->new NoSuchElementException("없는 아이디입니다."));

        if(!(a1.get().getPassword().equals(password))){
            throw new RuntimeException("비밀번호가 맞지 않습니다");
        } else{
           return true;
        }
    }

    public void findAll(){
        this.authorRepository.findAll();
    }

}
