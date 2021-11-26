package com.mycompany.edd_u4e1;

public class CArbolBinario {
    private CNodo raiz;

    public CArbolBinario() { this.raiz = null; }
    public CArbolBinario(CNodo raiz) { this.raiz = raiz; }
    public CArbolBinario(int info) { this.raiz = new CNodo(info); }

    public CNodo getRaiz() {return raiz; }

    public void insertar(int info){
        if(this.raiz != null){
            if (this.raiz.getInfo() > info){
                this.raiz.setIzq(insertar(this.raiz.getIzq(), info));
            }else if(this.raiz.getInfo() < info){
                this.raiz.setDer(insertar(this.raiz.getDer(), info));
            }
        }else{
            this.raiz = new CNodo(info);
        }
    }

    private CNodo insertar(CNodo padre, int info){
        if(padre != null){
            if (padre.getInfo() > info){
                padre.setIzq(insertar(padre.getIzq(), info));
            }else if(padre.getInfo() < info){
                padre.setDer(insertar(padre.getDer(), info));
            }
        }else{
            padre = new CNodo(info);
        }

        return padre;
    }

    public void eliminar(CNodo nodo, int info){
        CNodo a = new CNodo();
        CNodo b = new CNodo();
        if(nodo != null){
            if(info < nodo.getInfo()){eliminar(nodo.getIzq(),info);}
            else if(info > nodo.getInfo()){eliminar(nodo.getDer(),info);}
            else{
                CNodo aux = nodo;
                if(aux.getDer() == null){
                    nodo = aux.getIzq();
                }else{
                    if(aux.getIzq() == null){
                        nodo = aux.getDer();
                    }else{
                        a = aux.getIzq();
                        b = a;
                        while(a.getIzq() != null){
                            b = a;
                            a = a.getDer();
                        }
                    }
                }
                aux.setInfo(a.getInfo());
                aux = a;
                b.setDer(a.getIzq());
                aux = null;
            }
        }else{System.out.println("El nodo no se encuentra en el árbol");}
    }

    public void preorden(CNodo apuntador){
        if(apuntador != null){
            System.out.print(apuntador.getInfo() + " ");
            preorden(apuntador.getIzq());
            preorden(apuntador.getDer());
        }
    }

    public void inorden(CNodo apuntador){
        if(apuntador != null){
            inorden(apuntador.getIzq());
            System.out.print(apuntador.getInfo() + " ");
            inorden(apuntador.getDer());
        }
    }

    public void postorden(CNodo apuntador){
        if(apuntador != null){
            postorden(apuntador.getIzq());
            postorden(apuntador.getDer());
            System.out.print(apuntador.getInfo() + " ");
        }
    }

    public int contar(CNodo nodo){
        if(nodo != null){
            return 1 + contar(nodo.getDer()) + contar(nodo.getIzq());
        }else{return 0;}
    }

    public boolean buscar(int info){
        CNodo nodo = this.raiz;
        while(nodo != null){
            if(nodo.getInfo() == info){
                System.out.println("El valor se encuentra en el árbol binario");
                return true;
            }else if(nodo.getInfo() < info){
                nodo = nodo.getDer();
            }else{
                nodo = nodo.getIzq();
            }
        }
        System.out.println("El valor no se encuentra en el árbol binario");
        return false;
    }


}
