import React from 'react';

import ModalLogin from './ModalLogin';
import HeaderContainer from './HeaderContainer';
import CarrouselContainer from './CarrouselContainer';
import NewsContainer from './NewsContainer';
import TimelineContainer from './TimelineContainer';
import CountersContainer from './CountersContainer';
import ServicesContainer from './ServicesContainer';
import TestimonialsContainer from './TestimonialsContainer';
import BooksIconsContainer from './BooksIconsContainer';
import FooterContainer from './FooterContainer';
import CopyRightContainer from './CopyRightContainer';
import TopButton from './TopButton';

function App() {
  return (
    <div className="App">
      <ModalLogin />
      <HeaderContainer />
      <CarrouselContainer />
      <NewsContainer />
      <TimelineContainer />
      <CountersContainer />
      <ServicesContainer />
      <TestimonialsContainer />
      <BooksIconsContainer />
      <FooterContainer />
      <CopyRightContainer/>
      <TopButton />
    </div>
  );
}

export default App;
