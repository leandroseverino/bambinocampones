import React from 'react';

const CountersContainer = props => {
    return (
        <div className='section cl'>
            <div className='container'>
                <div className='row text-left stat-wrap'>
                    <div className='col-md-4 col-sm-4 col-xs-12'>
                        <span data-scroll className='global-radius icon_wrap effect-1 alignleft'><i
                                className='flaticon-study'></i></span>
                        <p className='stat_count'>12000</p>
                        <h3>Alunos já passaram por aqui conosco</h3>
                    </div>
                    <div className='col-md-4 col-sm-4 col-xs-12'>
                        <span data-scroll className='global-radius icon_wrap effect-1 alignleft'><i
                                className='flaticon-online'></i></span>
                        <p className='stat_count'>240</p>
                        <h3>Reuniões com os pais</h3>
                    </div>
                    <div className='col-md-4 col-sm-4 col-xs-12'>
                        <span data-scroll className='global-radius icon_wrap effect-1 alignleft'><i
                                className='flaticon-years'></i></span>
                        <p className='stat_count'>55</p>
                        <h3>Eventos por ano</h3>
                    </div>
                </div>
            </div>
        </div>
    )
};

export default CountersContainer;