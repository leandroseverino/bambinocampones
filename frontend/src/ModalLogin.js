import React from 'react';

const Site = props => {
    return (
        <div className="modal fade" id="login" tabIndex="-1" role="dialog" aria-labelledby="myModalLabel">
            <div className="modal-dialog modal-dialog-centered modal-lg" role="document">
                <div className="modal-content">
                    <div className="modal-header tit-up">
                        <button type="button" className="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        <h4 className="modal-title">Login de Pais e Professores</h4>
                    </div>
                    <div className="modal-body customer-box">
                        <ul className="nav nav-tabs">
                            <li><a className="active" href="#Login" data-toggle="tab">Login</a></li>
                            <li><a href="#Registration" data-toggle="tab">Registrar-se</a></li>
                        </ul>
                        <div className="tab-content">
                            <div className="tab-pane active" id="Login">
                                <form role="form" className="form-horizontal">
                                    <div className="form-group">
                                        <div className="col-sm-12">
                                            <input className="form-control" id="email1" placeholder="Nome Completo" type="text"></input>
                                        </div>
                                    </div>
                                    <div className="form-group">
                                        <div className="col-sm-12">
                                            <input className="form-control" id="exampleInputPassword1" placeholder="E-mail"
                                                type="email"></input>
                                        </div>
                                    </div>
                                    <div className="row">
                                        <div className="col-sm-10">
                                            <button type="submit" className="btn btn-light btn-radius btn-brd grd1">
                                                Enviar
                                            </button>
                                            <a className="for-pwd" href="javascript:;">Esqueceu a senha?</a>
                                        </div>
                                    </div>
                                </form>
                            </div>
                            <div className="tab-pane" id="Registration">
                                <form role="form" className="form-horizontal">
                                    <div className="form-group">
                                        <div className="col-sm-12">
                                            <input className="form-control" placeholder="Nome Completo" type="text"></input>
                                        </div>
                                    </div>
                                    <div className="form-group">
                                        <div className="col-sm-12">
                                            <input className="form-control" id="email" placeholder="E-mail" type="email"></input>
                                        </div>
                                    </div>
                                    <div className="form-group">
                                        <div className="col-sm-12">
                                            <input className="form-control" id="mobile" placeholder="Celular" type="email"></input>
                                        </div>
                                    </div>
                                    <div className="form-group">
                                        <div className="col-sm-12">
                                            <input className="form-control" id="password" placeholder="Senha"
                                                type="password"></input>
                                        </div>
                                    </div>
                                    <div className="row">
                                        <div className="col-sm-10">
                                            <button type="button" className="btn btn-light btn-radius btn-brd grd1">
                                                Salvar &amp; Continuar
                                            </button>
                                            <button type="button" className="btn btn-light btn-radius btn-brd grd1">
                                                Cancelar</button>
                                        </div>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    )
};

export default Site;