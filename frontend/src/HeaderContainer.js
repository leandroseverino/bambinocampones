import React from 'react';

const HeaderContainer = props => {
    return (
        <header className='top-navbar'>
            <nav className='navbar navbar-expand-lg navbar-light bg-light'>
                <div className='container-fluid'>
                    <a className='navbar-brand' href='index.html'>
                        <img src='images/logo_bambino.png'
                            alt='Logotipo da Escola Bambino Camponês.'
                            style={{ margin: '5px 0px', maxHeight: '90px', maxWidth: '350px' }} />
                    </a>
                    <button className='navbar-toggler'
                        type='button'
                        data-toggle='collapse'
                        data-target='#navbars-host'
                        aria-controls='navbars-rs-food'
                        aria-expanded='false'
                        aria-label='Toggle navigation'>
                        <span className='icon-bar'></span>
                        <span className='icon-bar'></span>
                        <span className='icon-bar'></span>
                    </button>
                    <div className='collapse navbar-collapse' id='navbars-host'>
                        <ul className='navbar-nav ml-auto'>
                            <li className='nav-item active'><a className='nav-link' href='index.html'>Home</a></li>
                            <li className='nav-item dropdown'>
                                <a className='nav-link dropdown-toggle' href='#' id='dropdown-a'
                                    data-toggle='dropdown'>Escola </a>
                                <div className='dropdown-menu' aria-labelledby='dropdown-a'>
                                    <a className='dropdown-item' href='course-grid-2.html'>Filosofia </a>
                                    <a className='dropdown-item' href='course-grid-3.html'>Nosssa história </a>
                                    <a className='dropdown-item' href='course-grid-4.html'>Nossa equipe </a>
                                    <a className='dropdown-item' href='course-grid-4.html'>Instalações </a>
                                    <a className='dropdown-item' href='course-grid-4.html'>Horários </a>
                                    <a className='dropdown-item' href='course-grid-4.html'>Depoímentos </a>
                                    <a className='dropdown-item' href='course-grid-4.html'>Nossa oração </a>
                                </div>
                            </li>
                            <li className='nav-item dropdown'>
                                <a className='nav-link dropdown-toggle' href='#' id='dropdown-a'
                                    data-toggle='dropdown'>Secretaria </a>
                                <div className='dropdown-menu' aria-labelledby='dropdown-a'>
                                    <a className='dropdown-item' href='course-grid-2.html'>Matrículas </a>
                                    <a className='dropdown-item' href='course-grid-3.html'>Material escolar </a>
                                    <a className='dropdown-item' href='course-grid-4.html'>Uniforme </a>
                                    <a className='dropdown-item' href='course-grid-4.html'>Determinações da escola </a>
                                </div>
                            </li>
                            <li className='nav-item dropdown'>
                                <a className='nav-link dropdown-toggle' href='#' id='dropdown-a' data-toggle='dropdown'>Mural
                                </a>
                                <div className='dropdown-menu' aria-labelledby='dropdown-a'>
                                    <a className='dropdown-item' href='blog.html'>Cardápio </a>
                                    <a className='dropdown-item' href='blog-single.html'>Avisos importantes </a>
                                    <a className='dropdown-item' href='blog-single.html'>Notícias </a>
                                    <a className='dropdown-item' href='blog-single.html'>Eventos </a>
                                    <a className='dropdown-item' href='blog-single.html'>Dicas </a>
                                    <a className='dropdown-item' href='blog-single.html'>Galerias de fotos </a>
                                    <a className='dropdown-item' href='blog-single.html'>Galerias de vídeos </a>
                                </div>
                            </li>
                            <li className='nav-item dropdown'>
                                <a className='nav-link dropdown-toggle' href='#' id='dropdown-a' data-toggle='dropdown'>Serviços
                                </a>
                                <div className='dropdown-menu' aria-labelledby='dropdown-a'>
                                    <a className='dropdown-item' href='blog.html'>Berçário I </a>
                                    <a className='dropdown-item' href='blog-single.html'>Berçário II </a>
                                    <a className='dropdown-item' href='blog-single.html'>Maternal I </a>
                                    <a className='dropdown-item' href='blog-single.html'>Maternal II </a>
                                    <a className='dropdown-item' href='blog-single.html'>Jardim I </a>
                                    <a className='dropdown-item' href='blog-single.html'>Jardim II </a>
                                    <a className='dropdown-item' href='blog-single.html'>Atividades extras </a>
                                </div>
                            </li>
                            <li className='nav-item'><a className='nav-link' href='contact.html'>Contato</a></li>
                        </ul>
                        <ul className='nav navbar-nav navbar-right'>
                            <li><a className='hover-btn-new log orange' href='#' data-toggle='modal'
                                data-target='#login'><span>Login</span></a></li>
                        </ul>
                    </div>
                </div>
            </nav>
        </header>
    )
};

export default HeaderContainer;