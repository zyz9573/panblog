const React = require('react');
const ReactDOM = require('react-dom');
const axios = require('axios');
const basePath = "http://localhost:8080/panblog/";

class App extends React.Component {

	constructor(props) {
		super(props);
		this.state = {users: []};
	}

// componentDidMount is the API invoked after React renders a component in the DOM.
	componentDidMount() {
/*		client({method: 'GET', path: '/panblog/users'}).done(response => {
			this.setState({username: response.users[0].name});
			this.setState({userid: response.users[0].id});
		});*/
		axios.get(basePath+"users/").then(response => {
			console.log(response);
			this.setState({username: response.data.pop().name});
			this.setState({userid: response.data.pop().id});
		});
	}

// render is the API to "draw" the component on the screen.
	render() {
		return (
			<div>
				<p>{this.state.userid}</p>
				<p>{this.state.username}</p>
				<p>App worked</p>
			</div>
		)
	}
}

ReactDOM.render(
	<App />,
	document.getElementById('react')
)