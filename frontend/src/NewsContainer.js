import React from 'react';

const NewsContainer = props => {
    return (
        <div id="overviews" className="section wb">
            <div className="container">
                <div className="section-title row text-center">
                    <div className="col-md-8 offset-md-2">
                        <h3>Últimas Notícias</h3>
                        <p className="lead">Notícias e novidades da Escola Bambino Camponês !</p>
                    </div>
                </div>
                <div className="row align-items-center">
                    <div className="col-xl-6 col-lg-6 col-md-12 col-sm-12">
                        <div className="message-box">
                            <h2>Unidos e participativos: Vídeos das nossa crianças</h2>
                            <p>Nesses momentos de recolhimento social, algumas crianças do Maternal II junto com suas famílias nos presentearam com um lindo vídeo incentivando os cuidados à nossa saúde e a importância da prevenção ao novo coronavírus.</p>
                            <p>Inicialmente cada família gravou individualmente seu filho/sua filha e após juntaram as gravações e editaram um belo vídeo com palavras, cartazes e manifestações com desejos de bons cuidados e esperança de breves dias melhores.</p>
                            <a href="#" className="hover-btn-new orange"><span>Ler mais</span></a>
                        </div>
                    </div>
                    <div className="col-xl-6 col-lg-6 col-md-12 col-sm-12">
                        <div className="post-media wow fadeIn">
                            <img src="http://www.bambinocampones.com.br/media/publicacao/Cartaz_campanha_crianças_videos_coronavirus.jpg" alt="" className="img-fluid img-rounded"></img>
                        </div>
                    </div>
                </div>
                <div className="row align-items-center">
                    <div className="col-xl-6 col-lg-6 col-md-12 col-sm-12">
                        <div className="post-media wow fadeIn">
                            <img src="http://www.bambinocampones.com.br/media/publicacao/Cartaz_videos_atividades_extras_quarentena_2020.jpg" alt="" className="img-fluid img-rounded"></img>
                        </div>
                    </div>
                    <div className="col-xl-6 col-lg-6 col-md-12 col-sm-12">
                        <div className="message-box">
                            <h2>Vídeos de aulas práticas</h2>
                            <p>Neste momento de cuidado e recolhimento em nossas casas precisamos estar mais juntos, unidos e protegidos, porém não esquecendo de deixar tudo mais feliz e animado.</p>
                            <p>Assim para deixar nossos dias mais cheio de alegria, energia e diversão convidamos nossas crianças e suas famílias a praticar exercícios e fazer algumas tarefas.</p>
                            <a href="#" className="hover-btn-new orange"><span>Ler mais</span></a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    )
};

export default NewsContainer;