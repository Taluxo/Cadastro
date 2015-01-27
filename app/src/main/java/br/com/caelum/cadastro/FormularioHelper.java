package br.com.caelum.cadastro;

import android.widget.EditText;
import android.widget.ImageView;
import android.widget.SeekBar;

/**
 * Created by aluno2 on 21/01/15.
 */
public class FormularioHelper {

    private Aluno aluno;
            private EditText nome;
            private EditText telefone;
            private EditText site;
            private SeekBar nota;
            private EditText endereco;
            private ImageView foto;



    public FormularioHelper(FormularioActivity activity){

        this.aluno = new Aluno();
        this.nome = (EditText) activity.findViewById(R.id.campo_nome);
        this.telefone = (EditText) activity.findViewById(R.id.campo_telefone);
        this.site = (EditText) activity.findViewById(R.id.campo_site);
        this.nota = (SeekBar) activity.findViewById(R.id.nota);
        this.endereco = (EditText) activity.findViewById(R.id.campo_endereco);
        this.foto = (ImageView) activity.findViewById(R.id.foto);
    }


    public Aluno pegaAlunoDoFormulario(){
        aluno.setNome(nome.getText().toString());
        aluno.setTelefone(telefone.getText().toString());
        aluno.setSite(site.getText().toString());
        aluno.setNota(nota.getProgress());

        return aluno;

    }
}

