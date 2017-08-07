import React from 'react';
import {connect} from 'react-redux';
import {bindActionCreators} from 'redux';

class ${NAME} extends React.Component {
  render() {
    return (
      <div>
      </div>
    );
  }
}

function mapStateToProps({}) {
  return {};
}

function mapDispatchToProps(dispatch) {
  return bindActionCreators({}, dispatch);
}

export default connect(mapStateToProps, mapDispatchToProps)(${NAME});