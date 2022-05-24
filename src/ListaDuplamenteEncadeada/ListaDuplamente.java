package ListaDuplamenteEncadeada;


public class ListaDuplamente {
    //descritor --descreve a lista
    Elemento inicio;
    Elemento fim;
    int quantidade;



    public void esvaziar(){
        inicio = null;
        quantidade =0;
        fim = null;
    }

    public void  addInicio(Elemento e){
        if(inicio ==null){
            inicio=e;
            quantidade++;
            fim=e;
        }else{
            inicio.ant=e;
            e.prox= inicio;
            inicio=e;
            quantidade++;

        }
    }

    public void  addFim(Elemento e){
        if(inicio == null){
            inicio=e;
            quantidade++;
            fim=e;
        }else{
            e.ant = fim;
            fim.prox =e;
            fim=e;
            quantidade++;
        }
    }

    public boolean exibir(){
        if(inicio!=null){
           Elemento aux= inicio;
            while (aux!=null){
                aux.show();
                aux=aux.prox;
            }

            return true;
        }else{
            //System.out.println("Lista vazia");
            return false;
        }
    }


        public boolean exibirReverso(){
            if(fim!=null){
                Elemento aux= fim;
                while (aux!=null){
                    aux.show();
                    aux=aux.ant;
                }

                return true;
            }else{
                //System.out.println("Lista vazia");
                return false;
            }
    }


    public boolean delFim(){
        if(inicio!=null){
            Elemento aux = fim;
            fim= aux.ant;
            quantidade--;
            if(quantidade==0){
                inicio=null;
            }
            return true;
        }else{
            //System.out.println("Lista vazia");
            return false;
        }
    }

    public boolean delIncio(){
        if(inicio!=null){
          // Elemento aux=inicio;
           // inicio =aux.prox;
            inicio=inicio.prox;
            quantidade--;
            if(quantidade==0){
                fim=null;
            }
            return true;
        }else{
            return false;
        }
    }
}
