import React from 'react';

const FooterContainer = props => {
    return (
        <footer className='footer'>
            <div className='container'>
                <div className='row'>
                    <div className='col-lg-4 col-md-4 col-xs-12'>
                        <div className='widget clearfix'>
                            <div className='widget-title'>
                                <h3>Sobre nós</h3>
                            </div>
                            <p> Nossa escola atende há 19 anos, alunos da Educação Infantil de faixa etária dos 04 meses até aos 6 anos, pelos turnos da manhã e tarde. Temos como filosofia formar um cidadão crítico, participativo, solidário, comprometido com o contexto do país. Contamos com uma equipe de profissionais qualificados e material didático atualizado. Nosso objetivo é orientar, respeitando a individualidade de cada criança, como um cidadão em formação.</p>
                            <div className='footer-right'>
                                <ul className='footer-links-soi'>
                                    <li><a href='#'><i className='fa fa-facebook'></i></a></li>
                                    <li><a href='#'><i className='fa fa-github'></i></a></li>
                                    <li><a href='#'><i className='fa fa-twitter'></i></a></li>
                                    <li><a href='#'><i className='fa fa-dribbble'></i></a></li>
                                    <li><a href='#'><i className='fa fa-pinterest'></i></a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                    <div className='col-lg-4 col-md-4 col-xs-12'>
                        <div className='widget clearfix'>
                            <div className='widget-title'>
                                <h3>Navegue direto</h3>
                            </div>
                            <ul className='footer-links'>
                                <li><a href='#'>Home</a></li>
                                <li><a href='#'>Escola</a></li>
                                <li><a href='#'>Secretaria</a></li>
                                <li><a href='#'>Mural</a></li>
                                <li><a href='#'>Serviços</a></li>
                                <li><a href='#'>Contato</a></li>
                            </ul>
                        </div>
                    </div>
                    <div className='col-lg-4 col-md-4 col-xs-12'>
                        <div className='widget clearfix'>
                            <div className='widget-title'>
                                <h3>Dados de Contato</h3>
                            </div>
                            <ul className='footer-links'>
                                <li><a href='mailto:#'>direcao@bambinocampones.com.br</a></li>
                                <li><a href='#'>www.bambinocampones.com.br</a></li>
                                <li>Rua Irmão Florêncio, nº 151 - Bairro Harmonia - Canoas - RS - Brasil - CEP: 92310-490</li>
                                <li>+55 (51) 3031-3240</li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </footer>
    )
};

export default FooterContainer;