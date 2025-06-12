function Formulario(){
    return(

        <form>
            <input type='text' placeholder='titulo'/>
            <input type='text' placeholder='isbn'/>
            <input type='text' placeholder='autor'/>
            <input type='text' placeholder='genero'/>
            <input type='text' placeholder='data_publicacao'/>

            <input type='button' value='Cadastrar'/>
            <input type='button' value='Alterar'/>
            <input type='button' value='Remover'/>
            <input type='button' value='Cancelar'/>
        </form>
    )
}

export default Formulario;