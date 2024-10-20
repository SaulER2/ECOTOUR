import axios from "axios";

const USER_BASE_REST_API_URL = "http://localhost:8079/api/auth/user";

class UserService{

   getAllUsers(){

      return axios.get(USER_BASE_REST_API_URL);

   } 

}

export default new UserService();