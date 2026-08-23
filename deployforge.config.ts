import {
    defineConfig,
    postgres,
    redis,
    http
} from "@deployforge/sdk";

export default defineConfig({

    runtime: {

        port: 8080,

        checks: [

            http({
                name: "health",

                request: {
                    method: "GET",
                    path: "/actuator/health"
                },

                expect: {
                    status: 200
                }
            })

        ]

    },



});