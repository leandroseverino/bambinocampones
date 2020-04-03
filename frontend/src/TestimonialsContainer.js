import React from 'react';

const TestimonialsContainer = props => {
    return (
        <div id='testimonials' className='parallax section db parallax-off'
            style={{backgroundImage: "url('images/parallax_04.jpg')"}}>
            <div className='container'>
                <div className='section-title text-center'>
                    <h3>Depoímentos</h3>
                    <p>Aqui alguns dos depoímentos dos pais, amigos e parceiros de nossa escola ao longo dos últimos anos.</p>
                </div>
                <div className='row'>
                    <div className='col-md-12 col-sm-12'>
                        <div className='testi-carousel owl-carousel owl-theme'>
                            <div className='testimonial clearfix'>
                                <div className='testi-meta'>
                                    <img src='%PUBLIC_URL%/images/testi_01.png' alt='' className='img-fluid'></img>
                                    <h4>Juliana Veiga </h4>
                                </div>
                                <div className='desc'>
                                    <h3><i className='fa fa-quote-left'></i> Ótima escola!</h3>
                                    <p className='lead'>A Bambino é uma ótima escola, que preza pela educação da minha pequena Gabrielle há 03 (três) anos, com muito carinho e dedicação. Parabéns à toda equipe e obrigada !.</p>
                                </div>
                            </div>
                            <div className='testimonial clearfix'>
                                <div className='testi-meta'>
                                    <img src='%PUBLIC_URL%/images/testi_02.png' alt='' className='img-fluid'></img>
                                    <h4>Jacques Philips </h4>
                                </div>
                                <div className='desc'>
                                    <h3><i className='fa fa-quote-left'></i> Awesome Services!</h3>
                                    <p className='lead'>Explain to you how all this mistaken idea of denouncing pleasure and
                                        praising pain was born and I will give you completed.</p>
                                </div>
                            </div>
                            <div className='testimonial clearfix'>
                                <div className='testi-meta'>
                                    <img src='%PUBLIC_URL%/images/testi_03.png' alt='' className='img-fluid '></img>
                                    <h4>Venanda Mercy </h4>
                                </div>
                                <div className='desc'>
                                    <h3><i className='fa fa-quote-left'></i> Great 'and' Talented Team!</h3>
                                    <p className='lead'>The master-builder of human happines no one rejects, dislikes avoids
                                        pleasure itself, because it is very pursue pleasure. </p>
                                </div>                                
                            </div>
                            <div className='testimonial clearfix'>
                                <div className='testi-meta'>
                                    <img src='images/testi_01.png' alt='' className='img-fluid'></img>
                                    <h4>James Fernando </h4>
                                </div>
                                <div className='desc'>
                                    <h3><i className='fa fa-quote-left'></i> Wonderful Support!</h3>
                                    <p className='lead'>They have got my project on time with the competition with a sed highly
                                        skilled, and experienced and professional team.</p>
                                </div>
                            </div>
                            <div className='testimonial clearfix'>
                                <div className='testi-meta'>
                                    <img src='images/testi_02.png' alt='' className='img-fluid'></img>
                                    <h4>Jacques Philips </h4>
                                </div>
                                <div className='desc'>
                                    <h3><i className='fa fa-quote-left'></i> Awesome Services!</h3>
                                    <p className='lead'>Explain to you how all this mistaken idea of denouncing pleasure and
                                        praising pain was born and I will give you completed.</p>
                                </div>                                
                            </div>
                            <div className='testimonial clearfix'>
                                <div className='testi-meta'>
                                    <img src='images/testi_03.png' alt='' className='img-fluid'></img>
                                    <h4>Venanda Mercy </h4>
                                </div>
                                <div className='desc'>
                                    <h3><i className='fa fa-quote-left'></i> Great 'and' Talented Team!</h3>
                                    <p className='lead'>The master-builder of human happines no one rejects, dislikes avoids
                                        pleasure itself, because it is very pursue pleasure. </p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    )
};

export default TestimonialsContainer;